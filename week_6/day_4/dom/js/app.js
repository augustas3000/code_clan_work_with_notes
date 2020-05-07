// console.log('app loaded', window);
document.addEventListener('DOMContentLoaded', () => {
  // const para = document.querySelector('#welcome-paragraph');

  // this is run before html is rendered hence null error: need event listener:
  // para.textContent = 'wgwn!';
  // console.log(para);
  // console.log('dir below');
  // console.dir(para);

  // const redElement = document.querySelector('.red');
  // console.log(redElement);
  // console.dir(redElement);

  // const redElement = document.querySelector('li.red');
  // console.log(redElement);
  // console.dir(redElement);

  // const redListItem = document.querySelector('li.red');
  // console.log(redListItem);
  // redListItem.textContent = "RED!!!";
  // console.log(redListItem);

  // const redListItem = document.querySelector('li.red');
  // console.log(redListItem);
  // redListItem.textContent = "RED!!!";
  // redListItem.classList.add('bold');


  // select class name from all elements
  // const allRedElements = document.querySelectorAll('.red');
  // console.dir(allRedElements);
  // console.log(allRedElements);


  // new DOM elements
  const newListItem = document.createElement('li');
  newListItem.textContent = 'Purple';
  newListItem.classList.add('purple');
  const targetList = document.querySelector('ul');
  targetList.appendChild(newListItem);
});



// Use document.querySelector to access the paragraph with the ID 'welcome-paragraph' from the DOM.
// What is the difference in output when you use console.log and console.dir?



// The DOM is initially a representation of the HTML because the DOM is created by parsing the HTML, but once this process is complete, the DOM may be manipulated by JavaScript, at which point it differs from the HTML.
//
// In the case of the BBC weather web page, we updated the DOM in devtools, but this only changed what the browser displays, not the HTML or CSS files themselves. The DOM viewer allows us to see the current state of the page.
//
// Updating the DOM in the devtools in a neat party-trick, but usually we’d interact with the DOM programmatically, using JavaScript. Let’s look at how we would go about that.
//
