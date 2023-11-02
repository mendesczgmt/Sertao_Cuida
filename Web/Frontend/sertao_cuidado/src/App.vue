<template>
  <main>
    <div class = "header">
      <MSuperior />
    </div>
    <FCalc />
  </main>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import MSuperior from './components/MSuperior.vue';
import FCalc from './components/FCalc.vue'

export default defineComponent({
  name: 'App',
  components: {
    MSuperior,
    FCalc
  }
});
</script>

<style>
  
</style>
