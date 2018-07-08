import { NgModule } from '@angular/core';
import {Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { CardComponent } from './card/card.component';
 
const routes: Routes = [
    {path: 'login' , component: LoginComponent},
    {path: 'card', component:CardComponent}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule{}

export const routingComponents = [ LoginComponent, CardComponent ]