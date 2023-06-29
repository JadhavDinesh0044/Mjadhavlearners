// script.js

// Wait for the DOM to be fully loaded
document.addEventListener("DOMContentLoaded", function() {
    // Get the form element
    const form = document.querySelector("form");
  
    // Add an event listener to the form's submit event
    form.addEventListener("submit", function(event) {
      event.preventDefault(); // Prevent the default form submission
  
      // Get the input values
      const name = document.getElementById("name").value;
      const email = document.getElementById("email").value;
      const message = document.getElementById("message").value;
  
      // Perform validation and send the form data to the server
      // You can add your own logic here
  
      // Clear the form inputs after submission
      form.reset();
    });
  });
  
  // Wait for the DOM to be fully loaded
  $(document).ready(function() {
    // Add a tooltip to an element with the class "tooltip-element"
    $(".tooltip-element").tooltip();
  });
  