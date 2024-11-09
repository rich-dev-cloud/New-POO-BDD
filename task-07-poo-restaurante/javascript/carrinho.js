function loadData() {
    var itensList = document.getElementById("itens-list");
    var cartData = localStorage.getItem("cart");

    if (cartData) {
        cartData = JSON.parse(cartData);
    } else {
        cartData = [];
    }

    for (var i = 0; i < cartData.length; i++) {
        var item = cartData[i];

        var itemElement = `
            <li class="itens-list__item">
            <div class="item__info">
                <div class="item__img-container">
                    <img src="${item.imageUrl}" alt="" class="item__img">
                </div>
                <div>
                    <h3 class="item__title">${item.nome}</h3>
                    <p class="item__preco">R$${item.preco}</p>
                </div>
            </div>

            <button class="item__button-delete" type="button">
                <i class="bi bi-trash3"></i>
            </button>
        </li>
        `;

        itensList.innerHTML += itemElement;
    }
}

document.addEventListener("DOMContentLoaded", () => {
    loadData();
});