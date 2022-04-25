import AXIOS from "../axios-books/axios";

export const BookService = {
    fetchBooks: () => {
        return AXIOS.get(`/api/books`);
    },
    getBook: (id) => {
        return AXIOS.get(`/api/books/${id}`)
    },
    addBook: (bookBody) => {
        return AXIOS.post(`/api/books/add`, bookBody)
    },
    editBook: (id, bookBody) => {
        return AXIOS.put(`/api/books/edit/${id}`, bookBody)
    },
    deleteBook: (id) => {
        return AXIOS.delete(`/api/books/delete/${id}`)
    }
}