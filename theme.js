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