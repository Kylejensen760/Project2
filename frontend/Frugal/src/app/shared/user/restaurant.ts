import { User } from './user';
import { Tag } from 'src/app/restaurantView/tag';

export class Restaurant extends User{
    name: string;
    tags: Tag[];
    lineOne: string;
    email: string; 
    lineTwo: string;
    city: string;
    state: string;
    zip: string;
    websiteUrl: string;
    openingTime: string;
    closingTime: string;
}
