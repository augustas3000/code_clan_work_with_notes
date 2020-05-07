document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript loaded');

    let counter = 0;

    const handleFormSubmit = function(event) {
          event.preventDefault();
          counter += 1;
          const new_item = document.createElement('li');

          new_item.innerHTML = `<h2>${event.target.title.value}</h2><p>${event.target.author.value}</p><p>${event.target.category.value}</p>`

          const list = document.querySelector('#reading-list');
          list.appendChild(new_item);
          form.reset();

          if (counter === 1) {
            const delete_btn = document.createElement('form');
            delete_btn.innerHTML = `

            <form class="btn-delete" action="index.html" method="post">

            <input type="submit" value="delete all"/>
            </form>`
            form.appendChild(delete_btn);
          }
        };

        const form = document.querySelector('#new-item-form');

        form.addEventListener('submit', handleFormSubmit);



    // delete list

})
