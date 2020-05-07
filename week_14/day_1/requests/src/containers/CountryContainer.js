import React from 'react';
import CountrySelector from '../components/CountrySelector';
import CountryDetail from '../components/CountryDetail';

class CountryContainer extends React.Component {
  constructor(props){
    super(props);
    this.state = {
      countries: [],
      selectedCountryAlpha3Code: "",
      songs: {}
    };


    this.handleCountrySelected = this.handleCountrySelected.bind(this);
  }

  componentDidMount() {
    // url to fetch from
    const url = "https://restcountries.eu/rest/v2/all";
    const url_songs = "https://itunes.apple.com/gb/rss/topsongs/limit=20/json";

    fetch(url)
      .then(res => res.json())
      .then(countries => this.setState({ countries: countries }))
      .catch(err => console.error);


      // fetch function for homework
    fetch(url_songs)
      .then(res => res.json())
      .then(songs => this.setState({ songs: songs }))
      .catch(err => console.error);

  }



  handleCountrySelected(alpha3Code) {
    this.setState({selectedCountryAlpha3Code: alpha3Code});
  }


  render(){


    const selectedCountry = this.state.countries.find(country => country.alpha3Code === this.state.selectedCountryAlpha3Code);
    // console.log(selectedCountry);

// functions for things will needs displayed
    if (Object.keys(this.state.songs).length > 0) {
      const allSongs = this.state.songs.feed.entry;
      const entryObject = this.state.songs.feed.entry[0];
      const artist = this.state.songs.feed.entry[0]['im:artist'].label;
      const song_title = this.state.songs.feed.entry[0]['im:name'].label;

      const positionInCharts = allSongs.indexOf(entryObject);

      console.log(artist);
      console.log(song_title);
      console.log(positionInCharts);
    }

    return (
      <div>
        <h2>Country Container</h2>
        <CountrySelector
        countries={this.state.countries}
        onCountrySelect={this.handleCountrySelected}/>


        <CountryDetail country={selectedCountry} />
      </div>
    );
  }
}

export default CountryContainer;




// Lifecycle:
// 1.render() - countryContaienr
// 2.CountryContainer state (countries[]), selectedCountryAlphaCode. - Country container renderede
// 3. Still rendering, before mounting, empty props passed so not much rendered
// 4. Now the component mounts.
// 5.componentDidMount() - now is the time for this method.
// 6.Then we fetch as part of above method, using that info we setState
// 7. Then component rerenders with all chain of children
// 8. All happens in milliseconds.
// 9 user selects a country
// 10. sountry containers state changes
// 11. rerender()
// 12.Country Detail props - Country object now available
