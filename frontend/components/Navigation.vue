<script setup lang="ts">

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
            <NavLink to="/betting" active>
              Betting
            </NavLink>
          </NavItem>
        </NavbarNavList>
        <NavItemDropdown flex>
          <NavItemDropdownToggle>Dropdown</NavItemDropdownToggle>
          <DropdownMenu>
            <DropdownItem>Action</DropdownItem>
            <DropdownItem to="/betting">
              betting
            </DropdownItem>
            <DropdownItemDivider/>
            <DropdownItem>Something else here</DropdownItem>
          </DropdownMenu>
        </NavItemDropdown>
      </NavbarCollapse>
    </Container>
  </Navbar>
</template>

<style scoped>

</style>