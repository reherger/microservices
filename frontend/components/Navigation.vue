<script setup lang="ts">
const auth = useAuth()
</script>

<template>
  <Navbar
      expand="lg"
      theme="dark"
      background-color="dark"
  >
    <Container type="fluid">
      <NavbarBrand>Microservices</NavbarBrand>
      <NavbarToggler/>
      <NavbarCollapse>
        <NavbarNavList margin="e-auto b-2 b-lg-0">
          <NavItem>
            <NavLink to="/" active>
              Home
            </NavLink>
          </NavItem>
          <NavItem>
            <NavLink to="/betting">
              Betting
            </NavLink>
          </NavItem>
        </NavbarNavList>
        <LoginLink to="/api/login" class="p-2" external flex v-if="!auth.loggedIn">
          Sign in
        </LoginLink>
        <RegisterLink to="/api/register" class="p-2" external flex v-if="!auth.loggedIn">
          Sign up
        </RegisterLink>
        <NavItemDropdown flex v-if="auth.loggedIn">
          <NavItemDropdownToggle class="text-primary">Hi, {{auth.user.name}}</NavItemDropdownToggle>
          <DropdownMenu>
            <DropdownItem to="/betting">
              Betting
            </DropdownItem>
            <DropdownItemDivider/>
            <DropdownItem>
              <NuxtLink to="/api/logout" external>
                Sign out
              </NuxtLink>
            </DropdownItem>
          </DropdownMenu>
        </NavItemDropdown>
      </NavbarCollapse>
    </Container>
  </Navbar>
</template>

<style scoped>

</style>