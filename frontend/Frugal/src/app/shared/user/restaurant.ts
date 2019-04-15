import { User } from './user';
import { Tag } from 'src/app/restaurantView/tag';
import { Review } from '../review/review';
import { menuItem } from 'src/app/core/menuItem/menuItem';

export class Restaurant extends User{
    name: string;
    tags: Tag[];

    restaurant_id: number;
    phone: string; 
    lineOne: string;
    email: string; 
    lineTwo: string;
    city: string;
    state: string;
    zip: string;
    websiteUrl: string;
    openingTime: string;
    closingTime: string;
    review: Review[]; 
   // menuItem: menuItem[]
    id: number;
    itemName: string;
    itemPrice: number;
    specialPrice: number;
    specialStart: number;
    specialEnd: number; 
    imageLink: string;
}
