let removeButton = document.querySelectorAll(".remove-button")

function getProduct(url){
    fetch(url)
        .then(console.log("OK"))
}

function removeFromCartBtn(){
    for (const cartButtonElement of removeButton) {
        cartButtonElement.addEventListener('click', ()=> {
            let productId = cartButtonElement.getAttribute('remove-by-id')
            console.log(productId)
            getProduct(productId)
        })
    }
}