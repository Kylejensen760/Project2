import { User } from './user';

export class Restaurant extends User{
    lineOne: string;
    lineTwo: string;
    city: string;
    state: string;
    zip: string;
    websiteUrl: string;
    openingTime: string;
    closingTime: string;
}
