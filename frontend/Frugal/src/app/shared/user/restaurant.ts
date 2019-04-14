import { User } from './user';

export class Restaurant extends User{
    name: string; 
    phone: string; 
    lineOne: string;
    lineTwo: string;
    city: string;
    state: string;
    zip: string;
    websiteUrl: string;
    openingTime: string;
    closingTime: string;
}
