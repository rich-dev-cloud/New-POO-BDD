function addToCart(produtoData) {
    console.log("produtoData: ", produtoData);
    var preco = produtoData.preco;

    for (var i = 0; i < produtoData.adicionais.length; i++) {
        var adicional = produtoData.adicionais[i];
        var checkboxAdicional = document.getElementById(`adicional-${adicional.id}`);

        if (checkboxAdicional.checked) {
            preco += adicional.preco;
        }
    }

    var cartData = localStorage.getItem("cart");

    if (cartData) {
        cartData = JSON.parse(cartData);
    } else {
        cartData = [];
    }

    cartData.push({
        id: produtoData.id,
        imageUrl: produtoData.imageUrl,
        nome: produtoData.nome,
        preco: preco,
    });

    localStorage.setItem("cart", JSON.stringify(cartData));
    window.location.href = "/carrinho.html";
}

async function loadData() {
    var response = await fetch("./javascript/data.json");
    var data = await response.json();
    var queryParams = new URLSearchParams(window.location.search);

    var restaurantId = queryParams.get("restauranteId");
    var restaurantData = data.restaurantes.find((restaurant) => restaurant.id === Number(restaurantId));
    
    var restaurantContainer = document.getElementById("restaurant-container");
    var produtosListContainer = document.getElementById("produtos-list");

    restaurantContainer.innerHTML = `
        <div class="restaurant-info__img-container">
            <img
                src="${restaurantData.imageUrl}"
                class="restaurant-info__img-container"
            />
        </div>

        <div class="restaurant-info__container">
            <h2 class="restaurant-info__title">${restaurantData.nome}</h2>
            <p class="restaurant-info__location">
                <i class="bi bi-geo-alt"></i>
                ${restaurantData["localização"]}
            </p>
        </div>
    `;

    for (var index = 0; index < restaurantData.produtos.length; index++) {
        let produto = restaurantData.produtos[index];

        var produtoContainer = document.createElement("li");
        produtoContainer.className = "produtos-list__card-produto";
        produtoContainer.innerHTML = `
            <div class="card-produto__img-container">
                    <img src="${produto.imageUrl}" alt="" class="card-produto__img">
                </div>
                <div class="card-produto__info">
                    <h3 class="card-produto__title">${produto.nome}</h3>
                    <p class="card-produto__preco">
                        R$ ${produto.preco}
                    </p>

                    <div class="card-produto__adicionais">
                        <h4 class="adicionais__title">Adicionais</h4>
                        <ul class="adicionais__itens">
                            ${produto.adicionais.map((adicional) => (`
                                <li class="adicionais__item">
                                    <label
                                        for="adicional-${adicional.id}"
                                        class="adicional__item__info"
                                    >
                                        <input
                                            type="checkbox"
                                            name="adicional-${adicional.id}"
                                            id="adicional-${adicional.id}"
                                        >
                                    
                                        <p class="adicional__item__title">
                                            ${adicional.nome}
                                        </p>
                                        <p class="adicional__item__preco">
                                            R$ ${adicional.preco}
                                        </p>
                                    </label>
                                </li>
                            `)).join('')}
                        </ul>
                    </div>
                </div>
        `;

        var addButton = document.createElement("button");
        addButton.innerHTML = `
            Adicionar
            <i class="bi bi-cart-plus"></i>
        `;
        addButton.className = "card-produto__button";
        console.log("produto: ", produto);
        addButton.addEventListener("click", () => {
            addToCart(produto);
        });

        produtoContainer.appendChild(addButton);
        produtosListContainer.appendChild(produtoContainer);
    }
} 

loadData();