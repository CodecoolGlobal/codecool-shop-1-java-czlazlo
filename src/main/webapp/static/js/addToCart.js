let cartButton = document.querySelectorAll(".btn-success")

addToCartBtn()
function getProduct(url){
    fetch(url)
        .then(console.log("OK"))
}

function addToCartBtn(){
    for (const cartButtonElement of cartButton) {
        cartButtonElement.addEventListener('click', ()=> {
           let productId = cartButtonElement.getAttribute('product-id')
            console.log(productId)
            getProduct(productId)
        })
    }
}