import { PedidoComponent } from './components/pedido/pedido.component';
import { InventarioComponent } from './components/inventario/inventario.component';
import { CuentaComponent } from './components/cuenta/cuenta.component';
import { CreateComponent } from './foo/create/create.component';
import { UpdateComponent } from './foo/update/update.component';
import { DetailComponent } from './foo/detail/detail.component';
import { ListaComponent } from './foo/lista/lista.component';
import { FacturaComponent } from './components/factura/factura.component';
import { ArticuloComponent } from './components/articulo/articulo.component';
import { APP_BASE_HREF } from "@angular/common";
import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { EmptyRouteComponent } from "./empty-route/empty-route.component";

const routes: Routes = [


 {path: "articulo", component: ArticuloComponent },
 {path: "factura", component: FacturaComponent },
 {path: "cuenta", component: CuentaComponent },
 {path: "inventario", component: InventarioComponent },
 {path: "pedidos", component: PedidoComponent },

 {path: "lista", component: ListaComponent },
 {path: "detail/:id", component: DetailComponent },
 {path: "update/:id", component: UpdateComponent },
 {path: "create", component: CreateComponent },

  {path: "**", component: EmptyRouteComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  providers: [{ provide: APP_BASE_HREF, useValue: "/" }],
})
export class AppRoutingModule {}
