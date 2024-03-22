function show(val) {
    document.getElementById("d").value = val;
}

function v(val) {
    document.getElementById("d").value += val;
}

function calc() {
    try {
        show(eval(document.getElementById("d").value));
    } catch (e) {
        show('Error')
    }
}