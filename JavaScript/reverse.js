function reverseWords(sentence) {
  const words = sentence.split(" ");

  const reversedWords = words.map((word) => word.split("").reverse().join(""));

  const reversedSentence = reversedWords.join(" ");

  return reversedSentence;
}

const sentence = prompt("Enter a sentence:");
const reversedSentence = reverseWords(sentence);
console.log("Reversed sentence:", reversedSentence);
