// Function to reverse every word in a sentence
function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => word.split('').reverse().join(''));
    return reversedWords.join(' ');
}

// Function to perform sorting of an array in descending order
function sortArrayDescending(array) {
    return array.sort((a, b) => b - a);
}

// Taking a sentence as input and reversing every word
const inputSentence = prompt('Enter a sentence: ');
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log('Reversed Words in Sentence:', reversedSentence);

// Performing sorting of an array in descending order
const arrayToSort = [5, 2, 8, 1, 6, 3, 7, 4];
const sortedArray = sortArrayDescending(arrayToSort);
console.log('Sorted Array in Descending Order:', sortedArray);

//output
//Enter a sentence: sunday
//Reversed Words in Sentence: yadnus
//Sorted Array in Descending Order: [8, 7, 6, 5, 4, 3, 2, 1]
