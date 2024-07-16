<script setup lang="ts">

const nuxtApp = useNuxtApp()
const router = useRouter()

</script>

<template>
  <Navigation/>
  <NuxtLink to="/api/login" external>
    Sign in
  </NuxtLink>
  <NuxtLink to="/api/register" external>
    Sign up
  </NuxtLink>
  <Container type="fluid">
    <NuxtPage/>
  </Container>
</template>
