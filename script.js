const $html = document.querySelector('html');

function enableDarkMode() {
    $html.classList.toggle('dark-mode')
    document.getElementById('sun').style.right = '-10vh';
    document.getElementById('moon').style.right = '2.5vh';
}

function disableDarkMode() {
    $html.classList.toggle('dark-mode')
    document.getElementById('sun').style.right = '2.5vh';
    document.getElementById('moon').style.right = '-10vh';
}

document.addEventListener("DOMContentLoaded", function () {
    const anchor = document.getElementById("my-description");
    const screenWidth = window.innerWidth;
    const anchorWidth = (window.innerWidth / 10)*5;
    const speed = 100;
    anchor.style.left = '600px'

    anchor.addEventListener("transitionend", function () {
        moveAnchor()
    }, {once: false});

    function moveAnchor() {
        if (parseInt(anchor.style.left) < 0 && -parseInt(anchor.style.left) > anchorWidth) {
            anchor.style.left = `${screenWidth}px`;
        } else {
            anchor.style.left = `${parseInt(anchor.style.left) - speed}px`;
        }
    }

    moveAnchor();
});