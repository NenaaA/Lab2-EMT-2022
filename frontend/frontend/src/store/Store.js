import {BookService} from "../repository/bookService";
import {Component} from "react";

class Store extends Component {
    constructor(props) {
        super(props);
        this.state = {
            books: [],
            selectedBook: []
        }
    }

    fetchBooks = () => {
        BookService.fetchBooks()
            .then((data) => {
                this.setState({
                    books:data.data
                })
            });
    }

    getBook = (id) => {
        BookService.getBook(id)
            .then((data) => {
                this.setState({
                    selectedBook: data.data
                })
            });
    }

    addBook = (bookBody) => {
        BookService.addBook(bookBody)
            .then(() => {
                this.fetchBooks();
            })
    }

    editBook = (id, bookBody) => {
        BookService.editBook(id, bookBody)
            .then(()=>{
                this.fetchBooks();
            })
    }

    deleteBook = (id) => {
        BookService.deleteBook(id)
            .then(() => {
                this.fetchBooks();
            })
    }
}

export default Store;