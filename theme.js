const $html = document.querySelector('html');

function enableDarkMode() {
    $html.classList.toggle('dark-mode')
    document.getElementById('sun').style.right = '-100px';
    document.getElementById('moon').style.right = '50px';
}

function disableDarkMode() {
    $html.classList.toggle('dark-mode')
    document.getElementById('sun').style.right = '50px';
    document.getElementById('moon').style.right = '-100px';
}