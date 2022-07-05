define(function () {
    return {
        rows: [{
            view: 'button',
            label: 'Main',
            click: function () {
                routie('')
            }
        },
            {
                view: 'list',
                data: [
                    'audi a5',
                    'lada granta',
                    'bmw i8'
                ]
            }
        ]
    }
})