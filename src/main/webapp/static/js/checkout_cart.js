const openModalButton = document.getElementById("open-modal-button");
const modal = document.getElementById("modal");
const closeModalButton = document.getElementById("close-modal-button");
openModalButton.addEventListener("click", () => {
    modal.style.display = "block";
});
closeModalButton.addEventListener("click", () => {
    modal.style.display = "none";
});