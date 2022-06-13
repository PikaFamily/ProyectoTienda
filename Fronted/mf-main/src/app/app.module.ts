import { EmptyRouteComponent } from './../../../mf-vertical/src/app/empty-route/empty-route.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ArticuloComponent } from './components/articulo/articulo.component';
import { FacturaComponent } from './components/factura/factura.component';
import { CuentaComponent } from './components/cuenta/cuenta.component';
import { InventarioComponent } from './components/inventario/inventario.component';
import { PedidoComponent } from './components/pedido/pedido.component';

@NgModule({
  declarations: [
    AppComponent,
    EmptyRouteComponent,
    ArticuloComponent,
    FacturaComponent,
    CuentaComponent,
    InventarioComponent,
    PedidoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
