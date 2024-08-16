const $html = document.querySelector('html');
const $checkBox = document.querySelector('#switch');

$checkBox.addEventListener('change', function () {
    $html.classList.toggle('dark-mode')
})