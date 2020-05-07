const Film = require('./film.js');


const Cinema = function (films) {
  this.films = films;
};


// should be able to get a list of film titles

Cinema.prototype.list_film_titles = function() {
  let films_array = this.films;
  let all_titles = films_array.map((film_obj) => {
    return film_obj.title;
  });
  return all_titles;
};


// should be able to find a film by title
Cinema.prototype.find_by_title = function(title_str) {
  let films_array = this.films;

  let film_found = films_array.filter((film) => {
    return film.title === title_str;
  });

  if (film_found.length < 1) {
    return 'Film not found'
  } else {
    return film_found[0];
  }
};

// should be able to filter films by genre

Cinema.prototype.filter_by_genre = function(genre_str) {
  let films_array = this.films;

  let film_found = films_array.filter((film) => {
    return film.genre === genre_str;
  });

  if (film_found.length < 1) {
    return 'Nothing found'
  } else {
    return film_found;
  }
};


// should be able to check whether there are some films from a particular year

Cinema.prototype.filter_by_year = function(year_num) {
  let films_array = this.films;

  let film_found = films_array.filter((film) => {
    return film.year === year_num;
  });

  if (film_found.length < 1) {
    return 'Nothing found'
  } else {
    return film_found;
  }
};




// should be able to check whether all films are over a particular length

Cinema.prototype.ok_length = function(length_num) {
  // 





  let films_array = this.films;
  let length_confirmed = 'n';
  let resulting_item = {};
  let title = "";
  let counter = 0;
  // {'Black Panther': 'y'}




  let films_analysed = films_array.map((film_obj) => {
    resulting_item = {};
    if (film_obj.length > length_num) {
      length_confirmed = 'y';
      title = film_obj.title;
      resulting_item[title] = length_confirmed;
    } else {
      counter += 1;
      length_confirmed = 'n';
      title = film_obj.title;
      resulting_item[title] = length_confirmed;
    }
    return resulting_item;
  });


  if (counter > 0) {

    // `Not all the films are over ${length_num}`;
    let not_passed = films_analysed.filter((film) => {

      return film.a === 'n';
    });

    return not_passed;

  //   for (let film of not_passed) {
  //     return `${film} was longer than ${length_num}`;
  //   }
  // } else {
  //   return `All films are longer than ${length_num}`;
  }


  // let film_found = films_array.filter((film) => {
  //   return film.year === year_num;
  // });
  //
  // if (film_found.length < 1) {
  //   return 'Nothing found'
  // } else {
  //   return film_found;
  // }
};











// const multiplyByTwo_MAP = function(numbers) {
//   const result = numbers.map((number) => {
//     // return is crucial otherwise we get an array of [undefined, undefined...]
//     return number * 2;
//   });

//
//
//
//
moonlight = new Film('Moonlight', 'drama', 2016, 111);
bladeRunner = new Film('Blade Runner 2049', 'sci-fi', 2017, 164);
dunkirk = new Film('Dunkirk', 'history', 2017, 96);
blackPanther = new Film('Black Panther', 'action', 2018, 134);
trainspotting = new Film('T2 Trainspotting', 'drama', 2017, 117);

films = [moonlight, bladeRunner, dunkirk, blackPanther, trainspotting];
cinema = new Cinema(films);

console.log(cinema.ok_length(100));






module.exports = Cinema;
