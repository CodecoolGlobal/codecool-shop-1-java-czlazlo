function filterByCategory(categoryName) {
    let cards = document.querySelectorAll(".card")
    for (let cardElement of cards) {
        if(cardElement.dataset.category !== categoryName) {
            cardElement.parentNode.removeChild(cardElement)

        }

    }
}

function buttonForCategory() {
    let buttonForWoman = document.querySelector(".btn-for-woman")
    buttonForWoman.addEventListener("click", () => {
        filterByCategory("Woman")
    })
    let buttonForMan = document.querySelector(".btn-for-man")
    buttonForMan.addEventListener("click", () => {
        filterByCategory("Man")
    })
}

buttonForCategory()
