modalController()
paypalController()

function modalController() {
// Get the modal
    const modal = document.getElementById("card-modal");
    const btn = document.getElementById("creditcard-button");
    const span = document.getElementsByClassName("close")[0];

    btn.addEventListener("click", function () {
        modal.style.display = "block"
    })

    span.addEventListener("click", function () {
        modal.style.display = "none";
    })

    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }
    }
}

function paypalController() {
    const paypalBtn = document.querySelector("#paypal-button")
    const URL = "https://www.paypal.com/hu/signin"
    paypalBtn.addEventListener("click", function () {
        window.open(URL, '_blank')
    })
}