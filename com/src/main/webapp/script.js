JavaScript (script.js):
document.addEventListener('DOMContentLoaded', () => {
const photoInput = document.getElementById('photoInput');
const captureBtn = document.getElementById('captureBtn');
const canvas = document.getElementById('canvas');
const context = canvas.getContext('2d');
const photoPreview = document.getElementById('photoPreview');

// Function to render the captured photo on the interface
   function renderPhoto(dataURL) {
   const img = new Image();
   img.src = dataURL;
   photoPreview.innerHTML = '';
   photoPreview.appendChild(img);
}

// Event listener for when photo is selected
   photoInput.addEventListener('change', (event) => {
   const file = event.target.files[0];
   const reader = new FileReader();

   reader.onload = (e) => {
   const dataURL = e.target.result;
   renderPhoto(dataURL);
   };

   reader.readAsDataURL(file);
   });

// Event listener for capture button
   captureBtn.addEventListener('click', () => {
   const video = document.createElement('video');

// Use the user media API to capture a photo from camera
   navigator.mediaDevices.getUserMedia({ video: true })
.then((stream) => {
video.srcObject = stream;
video.play();

video.addEventListener('loadedmetadata', () => {
canvas.width = video.videoWidth;
