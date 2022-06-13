export class Foo {
  id: number;
  numFactura: number;
  TotalDinero: number;
  fecha: Date;
  ivaArticulo: number;

  constructor(id: number, numFactura: number, TotalDinero: number, fecha:Date, ivaArticulo:number){
      this.id = id;
      this.numFactura = numFactura;
      this.TotalDinero = TotalDinero;
      this.fecha = fecha;
      this.ivaArticulo = ivaArticulo;
  }
}
