# Introduction

This is the VueJS version of [StartBootstrap Resume](https://github.com/BlackrockDigital/startbootstrap-resume) template.

## Building from Source

1. Install [Git](https://git-scm.com/).
2. Clone or download the repository to your local machine.
3. Install [Node](https://nodejs.org/en/).
4. Install [Yarn](https://yarnpkg.org).
5. Install Vue CLI globally, `yarn global add @vue/cli` or `npm i -g @vue/cli`.
6. Run `yarn install` to install dependencies through terminal/CLI program.
7. Run `yarn run serve` through your favorite CLI program.

 **Note:** I suggest using package manager to install Git, Node and Yarn. You can use [Homebrew](httsp://brew.sh) if you're on a Mac or Linux/WSL, [Scoop](https://scoop.sh) or [Chocolatey](https://chocolatey.org/) if you're on Windows.

## Deploying to GitHub Pages

1. Change the repository URL in line `23` of `deploy.sh` file to your repository URL.
2. Set script execution flag e.g. `chmod +x deploy.sh`.
3. Run the script e.g. `./deploy.sh`.
4. Wait until the script finishes.

**Note:** VueJS also published a guide to deploy VueJS sites to other platforms, checkout the [deployment](https://cli.vuejs.org/guide/deployment.html) documentation for other platforms.

## Using Axios to Get Data using JSON Server Fake REST API

1. Clone or download the [axios](https://github.com/webdevsuperfast/startbootstrap-resume-vue/tree/axios) branch.
2. Clone or download [Start Bootstrap Resume Data](https://github.com/webdevsuperfast/startbootstrap-resume-vue-data) repository.
3. Edit the contents of `db.json` from the later repository.
4. Follow [instruction](https://github.com/webdevsuperfast/startbootstrap-resume-vue-data#deploy-to-heroku) to deploy your data to Heroku or other platforms.
5. Profit.

## Features

1. Built with Bootstrap Vue and Font Awesome Vue.
2. No jQuery dependency.

## Todos

* Bug fixes and cleanup

## Credits

* [StartBootstrap Resume](https://github.com/BlackrockDigital/startbootstrap-resume)
* [Bootstrap Vue](https://bootstrap-vue.js.org/)
* [Font Awesome Vue](https://github.com/FortAwesome/vue-fontawesome)
* [Smooth Scroll](https://github.com/cferdinandi/smooth-scroll)