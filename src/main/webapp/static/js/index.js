function filterByCategory(categoryName) {
    let cards = document.querySelectorAll(".card")
    for (let cardElement of cards) {
        if(cardElement.dataset.category !== categoryName) {
            cardElement.style.display= "none"


        }else {
            cardElement.style.display= "flex"
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
    let buttonForAll = document.querySelector(".btn-for-all")
    buttonForAll.addEventListener("click", () => {
        filterByCategory("All")
    })
}

buttonForCategory()
