import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { Skyrider26ApplicationProjectModule } from './project/project.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        Skyrider26ApplicationProjectModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class Skyrider26ApplicationEntityModule {}
