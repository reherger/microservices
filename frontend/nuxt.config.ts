// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  compatibilityDate: '2024-04-03',
  modules: ['@pinia/nuxt', 'usebootstrap', '@nuxtjs/kinde'],
  devtools: { enabled: true },
  vite: {
    css: {
      preprocessorOptions: {
        scss: {
          additionalData: `
          @import "@/assets/scss/_variables.scss";
          `,
          quietDeps: true,
        },
        sass: {
          quietDeps: true,
        },
      },
    },
  },
})