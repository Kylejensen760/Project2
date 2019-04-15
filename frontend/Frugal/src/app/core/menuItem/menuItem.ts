import { Restaurant } from 'src/app/shared/user/restaurant';

export class menuItem {
    id: number;
    restaurant?: Restaurant;
    restaurant_id: number;
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
    
}
