import { BaseEntity } from './../../shared';

export class Project implements BaseEntity {
    constructor(
        public id?: number,
        public title?: string,
        public jobTitle?: string,
        public detail?: string,
        public startDate?: any,
        public endDate?: any,
    ) {
    }
}
