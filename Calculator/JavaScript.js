let currentInput = '';
let operator = '';
let firstOperand = null;

function clearDisplay() {
    currentInput = '';
    operator = '';
    firstOperand = null;
    updateDisplay();
}

function appendToDisplay(value) {
    currentInput += value;
    updateDisplay();
}

function setOperation(op) {
    if (currentInput !== '') {
        if (firstOperand === null) {
            firstOperand = parseFloat(currentInput);
        } else {
            calculate();
        }
        operator = op;
        currentInput = '';
        updateDisplay();
    }
}

function calculate() {
    if (firstOperand !== null && currentInput !== '') {
        const secondOperand = parseFloat(currentInput);
        switch (operator) {
            case '+':
                currentInput = (firstOperand + secondOperand).toString();
                break;
            case '-':
                currentInput = (firstOperand - secondOperand).toString();
                break;
            case '*':
                currentInput = (firstOperand * secondOperand).toString();
                break;
            case '/':
                if (secondOperand !== 0) {
                    currentInput = (firstOperand / secondOperand).toString();
                } else {
                    currentInput = 'Error';
                }
                break;
            default:
                break;
        }
        operator = '';
        firstOperand = null;
        updateDisplay();
    }
}

function updateDisplay() {
    document.getElementById('display').value = currentInput;
}
