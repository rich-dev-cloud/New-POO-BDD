async function loadData() {
    var response = await fetch("./javascript/data.json");
    var data = await response.json();
    
    var restaurantListContainer = document.getElementById("restaurant-list");

    for (var index = 0; index < data.restaurantes.length; index++) {
        var restaurante = data.restaurantes[index];
        console.log(restaurante);

        var restauranteContainer = `
            <li class="restaurant-card">
                <a href="./produtos.html?restauranteId=${restaurante.id}">
                    <div class="restaurant-card__img-container">
                        <img src="${restaurante.imageUrl}" class="restaurant-card__img" />
                    </div>
                    <div class="restaurant-card__info">
                        <h2 class="restaurant-card__title">${restaurante.nome}</h2>
                        <p class="restaurant-card__location">
                            <i class="bi bi-geo-alt"></i>
                            ${restaurante["localização"]}
                        </p>
                    </div>
                </a>
            </li>
        `;

        restaurantListContainer.innerHTML += restauranteContainer;
    }
} 

loadData();