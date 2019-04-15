import { Menu } from 'src/app/menu/menu';

export class menuItem {
    id: number;
    itemName: string;
    itemPrice: number;
    specialPrice: number;
    specialStart: number;
    specialEnd: number;
    mon?: number;
    tue?: number; 
    wed?: number;
    thu?: number;
    fri?: number;
    sat?: number;
    sun?: number;
    imageLink: string;
}
