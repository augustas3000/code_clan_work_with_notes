// const path = require('path');
const HtmlWebPackPlugin = require('html-webpack-plugin');


const config = {
  entry: `${__dirname}/src/app.js`,
  output: {
    path: `${__dirname}/public`,
    // path: path.resolve(__dirname, 'public/js'),
    filename: 'js/bundle.js'
  },

  devServer: {
    contentBase: './public'
  },

  plugins: [
    new HtmlWebPackPlugin({
      filename: 'index.html',
      template: './src/index.html'
    })
  ]

};

module.exports = config;

// path and filename declarations - this syntax important if u want dev server to run


// mode definition can be put in package.json as in ,
// "build": "webpack --mode development"

// __dirname tells you the absolute path of the directory containing the currently executing file. also see commented out, a  way to avoid $?
