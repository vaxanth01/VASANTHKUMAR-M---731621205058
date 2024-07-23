var pali="sdam"

reverse_pali = pali.split('').reverse().join('');

// var result = pali === reverse_pali?pali+" yes palindrome":pali+" not palindrome";
if (pali === reverse_pali){
    console.log("yes palindrome")
}
else{
    console.log("no palindrome")

}
// console.log(result)
