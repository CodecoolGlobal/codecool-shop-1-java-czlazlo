const removeButton = document.querySelectorAll(".remove-button")

removeFromCartBtn()

function getProduct(url){
    fetch(url)
        .then(console.log("Deleted with OK"))
}

function removeFromCartBtn(){
    for (const cartButtonElement of removeButton) {
        cartButtonElement.addEventListener('click', ()=> {
            const productId = cartButtonElement.getAttribute('remove-by-id')
            console.log(productId)
            const id = parseInt(productId.slice(-1))
            console.log(id)
            getProduct(productId)
            hideProductFromUser(id)
        })
    }
}

function hideProductFromUser(productId) {
    const products = document.querySelectorAll(".horizontal-card")
    for (const product of products) {
        if (parseInt(product.getAttribute("data-productId")) === productId) {
            product.style.display = "none"
        }
    }
}