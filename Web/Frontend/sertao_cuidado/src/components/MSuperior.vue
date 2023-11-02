<template>
    <div class="header">
        <nav class="navbar navbar-background-color" role="navigation" aria-label="main navigation">
        <div class="navbar-brand">
            <img src="../assets/logo.png">

            <a role="button" class="navbar-burger" aria-label="menu" aria-expanded="false" data-target="navbarBasicExample">
                <span aria-hidden="true"></span>
                <span aria-hidden="true"></span>
                <span aria-hidden="true"></span>
            </a>
        </div>

        <div id="navbarBasicExample" class="navbar-menu">

            <div class="navbar-end">
                <div class="navbar-item">
                    <div class="buttons">
                        <a class="button is-primary">
                            <strong>Cadastro</strong>
                        </a>
                        <a class="button is-light">
                            Entrar
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </nav>
    </div>
</template>

<script lang="ts">

import { defineComponent } from 'vue';
export default defineComponent({
    name: "MSuperior"
})

</script>

<style scoped>
    img{
        padding: 0;
        margin: 0;
        width: 170px; 
        height: 70px;
    }

    .navbar-background-color{
        background-color: hsl(202, 98%, 23%);
        border-bottom: 5px solid #DFA952;
    }

</style>