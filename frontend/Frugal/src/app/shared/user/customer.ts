import { User } from './user';
import { Restaurant } from './restaurant';

export class Customer extends User{
    firstName: string;
    lastName: string;
    favoriteRestaurants : Restaurant[];
}
