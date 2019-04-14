import { Menu } from 'src/app/menu/menu';

export class menuItem {
    id: number;
    menu: Menu;
    itemName: string;
    itemPrice: number;
    specialPrice: number;
    specialDay: number;
    specialStart: number;
    specialEnd: number;
    mon?: number;
    tue?: number; 
    wed?: number;
    thu?: number;
    fri?: number;
    sat?: number;
    sun?: number;
}
