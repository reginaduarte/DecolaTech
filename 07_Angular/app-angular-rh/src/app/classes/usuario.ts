export class Usuario {
    constructor(
        public username: string = '',
        public password: string = '',
        public role?: string
    ) {}
}
