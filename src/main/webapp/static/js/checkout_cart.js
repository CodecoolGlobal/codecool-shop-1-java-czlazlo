const openModalButton = document.getElementById("open-modal-button");
const modal = document.getElementById("modal");
const closeModalButton = document.getElementById("close-modal-button");
const submitToPayment = document.getElementById("submit-button");
openModalButton.addEventListener("click", () => {
    modal.style.display = "block";
});
closeModalButton.addEventListener("click", () => {
    modal.style.display = "none";
});

submitToPayment.addEventListener("click", function () {
    window.location.href="/payment";
})