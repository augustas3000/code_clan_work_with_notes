// event = 'DOMContentLoaded' check doc;
document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript has loaded');



  const handleButtonClick = function() {
    console.log('Button has been clicked');
    // grab result paragraph
    const result_p = document.querySelector('#button-result');
    // change result paragraph text to say something
    result_p.textContent = 'The button has been clicked';
  }


  const button = document.querySelector('#button');
  // we dont invoke the function - why again?
  // once click fires, teh function will be run, but not at the time of definition!!!
  button.addEventListener('click', handleButtonClick);


  // event_obj is fed into the function so we can refer to it, for instance, access the properties like, event.target.value to see  the uswers input so far.
  const handleTextInput = function (event) {
    // console.log(event);
    const para_type = document.querySelector('#input-result');
    para_type.textContent = `You typed: ${event.target.value}`;

    // in returned event object
    // event.target.value
  };
  // select element
  const textInput = document.querySelector('#input');

  // add event listere plus function to selected element:
  textInput.addEventListener('input', handleTextInput);

  // select control:

  const dropDownSelected = function(event) {
    // grab result paragraph and update with selection results:
    const resultParagraph = document.querySelector('#select-result');

    resultParagraph.textContent = `You selected: ${event.target.value}`;
  }

  const dropDown = document.querySelector('#select');

  dropDown.addEventListener('change', dropDownSelected);

    // form control:

    const handleFormSubmit = function(event) {
      // prevent form from sendig post request on click;
      event.preventDefault();
      // calling debugger - through chrome dev tools
      // debugger;
      // console.log(event.target.first_name.value);
      // #form-result

      const para_form = document.querySelector('#form-result');


      para_form.textContent = `You have provided: First Name - ${event.target.first_name.value}, Last Name - ${event.target.last_name.value}`;
      //
      // In the callbacks event.target refers to the DOM element that dispatched the event. this also refers to the DOM element, so we could replace event.target with the this keyword when accessing the inputs values.
      //


    };

    const form = document.querySelector('#form');
    form.addEventListener('submit', handleFormSubmit);


});
