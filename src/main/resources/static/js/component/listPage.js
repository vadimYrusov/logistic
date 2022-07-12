define(function () {
    return function (tableId, url, columns) {
        return {
            rows: [
                {
                    view: 'toolbar',
                    cols: [
                        {
                            view: 'button',
                            label: 'Add',
                            click: function () {
                                var brandList = $$(tableId)
                                var id = brandList.add({})
                                brandList.editRow(id)
                            }
                        }
                    ]
                },
                {
                    id: tableId,
                    view: 'datatable',
                    columns: columns,
                    url: url,
                    save: url,
                    autoheight: true,
                    autowidth: true,
                    editable: true,
                    pager: 'brandPager',
                    datafetch: 3
                },
                {
                    view:'pager',
                    id:'brandPager',
                    size:3,
                    group:3,
                    template: '{common.first()}{common.prev()}{common.pages()}{common.next()}{common.last()}'
                }
            ]
        }
    }
})