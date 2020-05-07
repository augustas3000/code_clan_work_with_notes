<template>

  <div class="map-box">

    <div>
      <h3>Summary:</h3>
      <p>There are {{munros.length}} munros currently registered</p>
      <p>The highest munro is: {{currentHighest()}}</p>
      <!-- <p>There{{ withPopup.lat }}, {{ withPopup.lng }}</p>
      <p>Center is at {{ currentCenter }} and the zoom is: {{ currentZoom }}</p>
      <button @click="showLongText">
        Toggle long popup
      </button>
      <button @click="showMap = !showMap">
        Toggle map
      </button> -->
    </div>


    <l-map
      v-if="showMap"
      :zoom="zoom"
      :center="center"
      :options="mapOptions"
      class="map"
      @update:center="centerUpdate"
      @update:zoom="zoomUpdate"
    >
      <l-tile-layer
        :url="url"
        :attribution="attribution"
      />

      <l-marker v-for="(munro, index) in munros" :lat-lng="[munro.latlng_lat, munro.latlng_lng]" v-bind:key="index">
        <l-popup>
          <div >
            <p>Name: {{munro.name}}</p>
            <hr>
            <p>Height: {{munro.height}}m</p>
            <p>Region: {{munro.region}}</p>
            <p>Grid Ref: {{munro.gridref_letters}} {{munro.gridref_eastings}} {{munro.gridref_northings}}</p>
            <hr>
            <button v-on:click="handleClickAddFav(index)" type="button" name="button">Add to favorites</button>
            <button v-on:click="showDetails(munro)" type="button" name="button">Show details</button>
          </div>
        </l-popup>
      </l-marker>


    </l-map>
  </div>



</template>

<script>

import L from 'leaflet';
import { latLng } from "leaflet";
import { LMap, LTileLayer, LMarker, LPopup, LTooltip } from "vue2-leaflet";
import { Icon } from 'leaflet';
import { eventBus } from "@/main.js";


delete Icon.Default.prototype._getIconUrl;
Icon.Default.mergeOptions({
  iconRetinaUrl: require('leaflet/dist/images/marker-icon-2x.png'),
  iconUrl: require('leaflet/dist/images/marker-icon.png'),
  shadowUrl: require('leaflet/dist/images/marker-shadow.png'),
});



export default {
  name: "my-map",
  props: ['munros'],
  components: {
    LMap,
    LTileLayer,
    LMarker,
    LPopup,
    LTooltip
  },
  data() {
    return {
      zoom: 8,
      center: latLng(57.067617, -5.097655),
      url: 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
      attribution:
        '&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors',
      withPopup: latLng(47.41322, -1.219482),
      withTooltip: latLng(47.41422, -1.250482),
      currentZoom: 10,
      currentCenter: latLng(57.097468, -3.765564),
      showParagraph: false,
      mapOptions: {
        zoomSnap: 0.5
      },
      showMap: true
    };
  },
  computed: {

  },
  methods: {
    zoomUpdate(zoom) {
      this.currentZoom = zoom;
    },
    centerUpdate(center) {
      this.currentCenter = center;
    },
    showLongText() {
      this.showParagraph = !this.showParagraph;
    },
    innerClick() {
      alert("Click!");
    },
    handleClickAddFav(index) {
      eventBus.$emit('munro-added-to-fav', this.munros[index])
    },
    currentHighest() {
      // let current_max = 0;
      // let current_highest;
      // return 'hello'
      let current_highest = "";
      let current_best_height = 0;

      for (let munro of this.munros) {
        if (munro.height > current_best_height) {
          current_highest = munro.name
          current_best_height = munro.height
        }
      }
      return current_highest
      // debugger;
      // for (munro of this.munros) {
      //   if (munro.height > current_max) {
      //     current_max = munro.height
      //     current_highest = munro
      //   }
      // }
      // return current_highest
    },

    showDetails(munro) {
      eventBus.$emit('show-details-selected-dd', munro)
    }
  }
};
</script>


<style media="screen">
  .map-box {
    height: 500px;
  }


</style>



















<!-- <template>

  <div class="map-container-leaflet">
    <div class="map-container-info">

      <p>First marker is placed at {{ withPopup.lat }}, {{ withPopup.lng }}</p>

      <p>Center is at {{ currentCenter }} and the zoom is: {{ currentZoom }}</p>



      <button @click="showLongText">
        Toggle long popup
      </button>


      <button @click="showMap = !showMap">
        Toggle map
      </button>


    </div>

    <l-map
      v-if="showMap"
      :zoom="zoom"
      :center="center"
      :options="mapOptions"
      @update:center="centerUpdate"
      @update:zoom="zoomUpdate"
    >
      <l-tile-layer
        :url="url"
        :attribution="attribution"
      />

 -->
<!-- latLng(47.41322, -1.219482) -->
<!-- <l-marker v-for="(munro, index) in munros" v-bind:lat-lng="withPopup">
  <l-popup>
    <div @click="innerClick">
      I am a popup
      <p v-show="showParagraph">
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque
        sed pretium nisl, ut sagittis sapien. Sed vel sollicitudin nisi.
        Donec finibus semper metus id malesuada.
      </p>
    </div>
  </l-popup>
</l-marker>

 -->

      <!-- <l-marker v-for="(munro, index) in munros" :lat-lng="[munro.latlng_lat, munro.latlng_lng]" v-bind:key="index">
        <l-popup>
          <div @click="innerClick">
            I am a popup
            <p v-show="showParagraph">
              Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque
              sed pretium nisl, ut sagittis sapien. Sed vel sollicitudin nisi.
              Donec finibus semper metus id malesuada.
            </p>
          </div>
        </l-popup>
      </l-marker> -->





<!--
      <l-marker :lat-lng="withTooltip">
        <l-tooltip :options="{ permanent: true, interactive: true }">
          <div @click="innerClick">
            I am a tooltip
            <p v-show="showParagraph">
              Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque
              sed pretium nisl, ut sagittis sapien. Sed vel sollicitudin nisi.
              Donec finibus semper metus id malesuada.
            </p>
          </div>
        </l-tooltip>
      </l-marker> -->

<!--

    </l-map>
  </div>
</template>

<script>
import { latLng } from "leaflet";
import { LMap, LTileLayer, LMarker, LPopup, LTooltip } from "vue2-leaflet";
import { Icon } from 'leaflet';

delete Icon.Default.prototype._getIconUrl;
Icon.Default.mergeOptions({
  iconRetinaUrl: require('leaflet/dist/images/marker-icon-2x.png'),
  iconUrl: require('leaflet/dist/images/marker-icon.png'),
  shadowUrl: require('leaflet/dist/images/marker-shadow.png'),
});


export default {
  name: "my-map",
  props: ['munros'],
  components: {
    LMap,
    LTileLayer,
    LMarker,
    LPopup,
    LTooltip
  },
  data() {
    return {
      zoom: 7,
      center: latLng(56.820186, -5.105362),
      url: 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
      attribution:
        '&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors',
      withPopup: latLng(47.41322, -1.219482),
      // withTooltip: latLng(47.41422, -1.250482),
      currentZoom: 7,
      currentCenter: latLng(56.820186, -5.105362),
      showParagraph: false,
      mapOptions: {
        zoomSnap: 0.5
      },
      showMap: true
    };
  },
  methods: {
    zoomUpdate(zoom) {
      this.currentZoom = zoom;
    },
    centerUpdate(center) {
      this.currentCenter = center;
    },
    showLongText() {
      this.showParagraph = !this.showParagraph;
    },
    innerClick() {
      alert("Click!");
    }
  },
  computed: {

  }
};
</script>


<style lang="css" scoped>

  .map-container-leaflet {
    height: 500px;
    width: 100%;
  }

  .map {
    width: 100%;
  }

  .map-container-info {
    height: 120px;
    overflow: auto;
  }



</style> -->
<!--
<template>

  <div style="height: 500px; width: 100%">
    <div style="height: 200px overflow: auto;">
      <p>First marker is placed at {{ withPopup.lat }}, {{ withPopup.lng }}</p>
      <p>Center is at {{ currentCenter }} and the zoom is: {{ currentZoom }}</p>
      <button @click="showLongText">
        Toggle long popup
      </button>
      <button @click="showMap = !showMap">
        Toggle map
      </button>
    </div>
    <l-map
      v-if="showMap"
      :zoom="zoom"
      :center="center"
      :options="mapOptions"
      style="height: 80%"
      @update:center="centerUpdate"
      @update:zoom="zoomUpdate"
    >
      <l-tile-layer
        :url="url"
        :attribution="attribution"
      />
      <l-marker :lat-lng="withPopup">
        <l-popup>
          <div @click="innerClick">
            I am a popup
            <p v-show="showParagraph">
              Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque
              sed pretium nisl, ut sagittis sapien. Sed vel sollicitudin nisi.
              Donec finibus semper metus id malesuada.
            </p>
          </div>
        </l-popup>
      </l-marker>
      <l-marker :lat-lng="withTooltip">
        <l-tooltip :options="{ permanent: true, interactive: true }">
          <div @click="innerClick">
            I am a tooltip
            <p v-show="showParagraph">
              Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque
              sed pretium nisl, ut sagittis sapien. Sed vel sollicitudin nisi.
              Donec finibus semper metus id malesuada.
            </p>
          </div>
        </l-tooltip>
      </l-marker>
    </l-map>
  </div>
</template>

<script>
import { latLng } from "leaflet";
import { LMap, LTileLayer, LMarker, LPopup, LTooltip } from "vue2-leaflet";

export default {
  name: "Example",
  components: {
    LMap,
    LTileLayer,
    LMarker,
    LPopup,
    LTooltip
  },
  data() {
    return {
      zoom: 13,
      center: latLng(47.41322, -1.219482),
      url: 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
      attribution:
        '&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors',
      withPopup: latLng(47.41322, -1.219482),
      withTooltip: latLng(47.41422, -1.250482),
      currentZoom: 11.5,
      currentCenter: latLng(47.41322, -1.219482),
      showParagraph: false,
      mapOptions: {
        zoomSnap: 0.5
      },
      showMap: true
    };
  },
  methods: {
    zoomUpdate(zoom) {
      this.currentZoom = zoom;
    },
    centerUpdate(center) {
      this.currentCenter = center;
    },
    showLongText() {
      this.showParagraph = !this.showParagraph;
    },
    innerClick() {
      alert("Click!");
    }
  }
};
</script> -->
