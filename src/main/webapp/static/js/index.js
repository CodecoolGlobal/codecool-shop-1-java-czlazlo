function filterByCategory(categoryName) {
    let cards = document.querySelectorAll(".product")
    for (let cardElement of cards) {
        if(cardElement.firstElementChild.dataset.category !== categoryName) {
            cardElement.style.display= "none"


        }else  {
            cardElement.style.display= "flex"
        }

    }
}

function filterAll() {
    let allCard = document.querySelectorAll(".product")
    for(let cardElement of allCard) {
        cardElement.style.display= "flex"
    }
}

function filterBySupplier(supplierName) {
    let cardSupplier = document.querySelectorAll(".product")
    for (let supplierElement of cardSupplier) {
        if(supplierElement.firstElementChild.dataset.supplier !== supplierName) {
            supplierElement.style.display= "none"
        }else {
            supplierElement.style.display= "flex"
        }

    }
}


function buttonForCategory() {
    let buttonForWoman = document.querySelector(".btn-for-woman")
    buttonForWoman.addEventListener("click", () => {
        filterByCategory("Woman")
    })
    let buttonForMan = document.querySelector(".btn-for-man")
    console.log(buttonForMan)
    buttonForMan.addEventListener("click", () => {
        filterByCategory("Man")
    })
    let buttonForAll = document.querySelector(".btn-for-all")
    buttonForAll.addEventListener("click", () => {
        filterByCategory("All")
    })
}


function buttonForSupplier() {
    let buttonForGLS = document.querySelector(".supplier-gls")
    buttonForGLS.addEventListener("click", () => {
        filterBySupplier("GLS")

    })
    let buttonForDPD = document.querySelector(".supplier-dpd")
    buttonForDPD.addEventListener("click", () => {
        filterBySupplier("DPD")
    })

}

function buttonForAll() {
    let buttonAll = document.querySelector(".btn-for-all")
    buttonAll.addEventListener("click", () => {
        console.log("Dávid")
        filterAll()
    })
}

buttonForCategory()
buttonForSupplier()
buttonForAll()